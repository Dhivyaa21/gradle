/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.integtests.fixtures.executer;

import org.gradle.integtests.fixtures.logging.GroupedOutputFixture;

import java.util.List;
import java.util.Set;

public abstract class DelegatingExecutionResult implements ExecutionResult {
    protected final ExecutionResult delegate;

    public DelegatingExecutionResult(ExecutionResult delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getOutput() {
        return delegate.getOutput();
    }

    @Override
    public String getNormalizedOutput() {
        return delegate.getNormalizedOutput();
    }

    @Override
    public String getFormattedOutput() {
        return delegate.getFormattedOutput();
    }

    @Override
    public String getPlainTextOutput() {
        return delegate.getPlainTextOutput();
    }

    @Override
    public GroupedOutputFixture getGroupedOutput() {
        return delegate.getGroupedOutput();
    }

    @Override
    public String getError() {
        return delegate.getError();
    }

    @Override
    public ExecutionResult assertHasErrorOutput(String expectedOutput) {
        return delegate.assertHasErrorOutput(expectedOutput);
    }

    @Override
    public boolean hasErrorOutput(String expectedOutput) {
        return delegate.hasErrorOutput(expectedOutput);
    }

    @Override
    public ExecutionResult assertOutputEquals(String expectedOutput, boolean ignoreExtraLines, boolean ignoreLineOrder) {
        return delegate.assertOutputEquals(expectedOutput, ignoreExtraLines, ignoreLineOrder);
    }

    @Override
    public ExecutionResult assertOutputContains(String expectedOutput) {
        return delegate.assertOutputContains(expectedOutput);
    }

    @Override
    public ExecutionResult assertContentContains(String content, String expectedOutput, String label) {
        return delegate.assertContentContains(content, expectedOutput, label);
    }

    @Override
    public ExecutionResult assertNotOutput(String expectedOutput) {
        return delegate.assertNotOutput(expectedOutput);
    }

    @Override
    public ExecutionResult assertHasPostBuildOutput(String expectedOutput) {
        return delegate.assertHasPostBuildOutput(expectedOutput);
    }

    @Override
    public List<String> getExecutedTasks() {
        return delegate.getExecutedTasks();
    }

    @Override
    public ExecutionResult assertTasksExecutedInOrder(Object... taskPaths) {
        return delegate.assertTasksExecutedInOrder(taskPaths);
    }

    @Override
    public ExecutionResult assertTasksExecuted(Object... taskPaths) {
        return delegate.assertTasksExecuted(taskPaths);
    }

    @Override
    public ExecutionResult assertTaskExecuted(String taskPath) {
        return delegate.assertTaskExecuted(taskPath);
    }

    @Override
    public ExecutionResult assertTasksExecutedAndNotSkipped(Object... taskPaths) {
        return delegate.assertTasksExecutedAndNotSkipped(taskPaths);
    }

    @Override
    public ExecutionResult assertTaskNotExecuted(String taskPath) {
        return delegate.assertTaskNotExecuted(taskPath);
    }

    @Override
    public ExecutionResult assertTaskOrder(Object... taskPaths) {
        return delegate.assertTaskOrder(taskPaths);
    }

    @Override
    public Set<String> getSkippedTasks() {
        return delegate.getSkippedTasks();
    }

    @Override
    public ExecutionResult assertTasksSkipped(Object... taskPaths) {
        return delegate.assertTasksSkipped(taskPaths);
    }

    @Override
    public ExecutionResult assertTaskSkipped(String taskPath) {
        return delegate.assertTaskSkipped(taskPath);
    }

    @Override
    public ExecutionResult assertTasksNotSkipped(Object... taskPaths) {
        return delegate.assertTasksNotSkipped(taskPaths);
    }

    @Override
    public ExecutionResult assertTaskNotSkipped(String taskPath) {
        return delegate.assertTaskNotSkipped(taskPath);
    }
}
