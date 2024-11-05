package com.example.teamcity.common;

import com.example.teamcity.ui.BaseUiTest;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Листенер добавлен в pom.xml, чтобы работал механизм ретрая упавших тестов и использования дата провайдера в UI тестах
public final class AnnotationTransformerListener implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(com.example.common.RetryAnalyzer.class);
        if (BaseUiTest.class.isAssignableFrom(testMethod.getDeclaringClass())) {
            annotation.setDataProvider("browserProvider");
        }
    }

}
