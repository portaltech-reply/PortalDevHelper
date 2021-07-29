package com.github.renegust.portaldevhelper.services

import com.github.renegust.portaldevhelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
