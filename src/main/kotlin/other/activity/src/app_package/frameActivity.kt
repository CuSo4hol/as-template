package other.activity.src.app_package

fun frameActivityKt(
    applicationPackage:String?,
    activityClass:String,
    layoutName:String,
    packageName:String
)="""
package $packageName


import dagger.hilt.android.AndroidEntryPoint
import ${applicationPackage}.databinding.Activity${activityClass}Binding
import huansi.android.base.frame.base.BaseActivity

@AndroidEntryPoint
class ${activityClass}Activity : BaseActivity<Activity${activityClass}Binding, ${activityClass}ViewModel>() {
    override fun getLayoutBinding(): Activity${activityClass}Binding =
         Activity${activityClass}Binding.inflate(layoutInflater)
         
    override fun initialize() {
        TODO("Not yet implemented")
    }

    
    
}
"""