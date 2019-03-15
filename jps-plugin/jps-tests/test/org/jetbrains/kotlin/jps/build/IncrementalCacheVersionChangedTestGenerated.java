/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jps.build;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalCacheVersionChangedTestGenerated extends AbstractIncrementalCacheVersionChangedTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInCacheVersionChanged() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
    }

    @TestMetadata("clearedHasKotlin")
    public void testClearedHasKotlin() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/clearedHasKotlin/");
    }

    @TestMetadata("exportedModule")
    public void testExportedModule() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/exportedModule/");
    }

    @TestMetadata("javaOnlyModulesAreNotAffected")
    public void testJavaOnlyModulesAreNotAffected() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/javaOnlyModulesAreNotAffected/");
    }

    @TestMetadata("module1Modified")
    public void testModule1Modified() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/module1Modified/");
    }

    @TestMetadata("module2Modified")
    public void testModule2Modified() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/module2Modified/");
    }

    @TestMetadata("moduleWithConstantModified")
    public void testModuleWithConstantModified() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/moduleWithConstantModified/");
    }

    @TestMetadata("moduleWithInlineModified")
    public void testModuleWithInlineModified() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/moduleWithInlineModified/");
    }

    @TestMetadata("touchedFile")
    public void testTouchedFile() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/touchedFile/");
    }

    @TestMetadata("touchedOnlyJavaFile")
    public void testTouchedOnlyJavaFile() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/touchedOnlyJavaFile/");
    }

    @TestMetadata("untouchedFiles")
    public void testUntouchedFiles() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/untouchedFiles/");
    }

    @TestMetadata("withError")
    public void testWithError() throws Exception {
        runTest("jps-plugin/testData/incremental/cacheVersionChanged/withError/");
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/clearedHasKotlin")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClearedHasKotlin extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInClearedHasKotlin() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/clearedHasKotlin"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/exportedModule")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ExportedModule extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInExportedModule() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/exportedModule"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/javaOnlyModulesAreNotAffected")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class JavaOnlyModulesAreNotAffected extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJavaOnlyModulesAreNotAffected() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/javaOnlyModulesAreNotAffected"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/module1Modified")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Module1Modified extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInModule1Modified() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/module1Modified"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/module2Modified")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Module2Modified extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInModule2Modified() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/module2Modified"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/moduleWithConstantModified")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ModuleWithConstantModified extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInModuleWithConstantModified() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/moduleWithConstantModified"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/moduleWithInlineModified")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ModuleWithInlineModified extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInModuleWithInlineModified() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/moduleWithInlineModified"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/touchedFile")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TouchedFile extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInTouchedFile() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/touchedFile"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/touchedOnlyJavaFile")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TouchedOnlyJavaFile extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInTouchedOnlyJavaFile() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/touchedOnlyJavaFile"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/untouchedFiles")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UntouchedFiles extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInUntouchedFiles() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/untouchedFiles"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/cacheVersionChanged/withError")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class WithError extends AbstractIncrementalCacheVersionChangedTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInWithError() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/cacheVersionChanged/withError"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }
}
