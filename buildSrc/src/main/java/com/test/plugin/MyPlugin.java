package com.test.plugin;

import com.android.build.gradle.BaseExtension;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        BaseExtension ext = project.getExtensions().findByType(BaseExtension.class);
        if (ext != null) {
            ext.registerTransform(new MyTransform());
        }
    }
}
