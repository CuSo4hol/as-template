package other.activity.src.app_package

fun frameViewModel(
    packageName:String,
    activityClass:String
)="""
package $packageName

import huansi.android.base.frame.base.BaseViewModel
import javax.inject.Inject

class ${activityClass}ViewModel @Inject constructor() : BaseViewModel() {
    
}
"""