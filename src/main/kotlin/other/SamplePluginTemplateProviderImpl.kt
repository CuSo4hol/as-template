package other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.activity.frameActivityTemplate

class SamplePluginTemplateProviderImpl : WizardTemplateProvider() {
    override fun getTemplates(): List<Template>  = listOf(
        // activity的模板
        frameActivityTemplate,
        // fragment的模板
//        mvvmFragmentTemplate
    )
}