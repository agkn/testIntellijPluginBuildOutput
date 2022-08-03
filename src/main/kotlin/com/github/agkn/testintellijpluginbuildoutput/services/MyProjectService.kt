package com.github.agkn.testintellijpluginbuildoutput.services

import com.intellij.openapi.project.Project
import com.github.agkn.testintellijpluginbuildoutput.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
