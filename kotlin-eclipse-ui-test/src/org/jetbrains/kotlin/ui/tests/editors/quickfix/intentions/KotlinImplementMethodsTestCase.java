package org.jetbrains.kotlin.ui.tests.editors.quickfix.intentions;

import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
import org.jetbrains.kotlin.testframework.utils.EditorTestUtils;
import org.jetbrains.kotlin.ui.editors.quickassist.KotlinImplementMethodsProposal;

public class KotlinImplementMethodsTestCase extends AbstractKotlinQuickAssistTestCase<KotlinImplementMethodsProposal> {
	private boolean isSpacesForTab;
	private int initialSpacesCount;

	@Override
	public void configure() {
		super.configure();
		
		isSpacesForTab = EditorsUI.getPreferenceStore().getBoolean(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS);
		initialSpacesCount = EditorsUI.getPreferenceStore().getInt(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH);
		EditorsUI.getPreferenceStore().setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS, true);
		EditorsUI.getPreferenceStore().setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH, 4);
	}

	@Override
	public void afterTest() {
		super.afterTest();
		EditorsUI.getPreferenceStore().setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS, isSpacesForTab);
		EditorsUI.getPreferenceStore().setValue(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH, initialSpacesCount);
	}

	protected void doTest(String testPath) {
		doTestFor(testPath, new KotlinImplementMethodsProposal());
	}

	@Override
	protected void assertByEditor(JavaEditor editor, String expected) {
		EditorTestUtils.assertByEditor(editor, removeCaretAndSelection(expected));
	}
	
	private String removeCaretAndSelection(String text) {
		return text
				.replaceAll("<caret>", "")
				.replaceAll("<selection>", "")
				.replaceAll("</selection>", "");
	}
}
