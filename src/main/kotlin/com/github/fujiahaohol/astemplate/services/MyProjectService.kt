package com.github.fujiahaohol.astemplate.services

import com.intellij.openapi.project.Project
import com.github.fujiahaohol.astemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
