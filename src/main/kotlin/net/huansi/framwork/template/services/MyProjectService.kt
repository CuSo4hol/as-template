package net.huansi.framwork.template.services

import com.intellij.openapi.project.Project
import net.huansi.framwork.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
