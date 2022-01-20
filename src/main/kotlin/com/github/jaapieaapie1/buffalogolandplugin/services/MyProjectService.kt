package com.github.jaapieaapie1.buffalogolandplugin.services

import com.intellij.openapi.project.Project
import com.github.jaapieaapie1.buffalogolandplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
