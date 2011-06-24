/*
 * Created on 27/apr/2010
 *
 * Copyright 2010 by Andrea Vacondio (andrea.vacondio@gmail.com).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */
package org.sejda.core.manipulation.service;

import org.sejda.core.exception.TaskException;
import org.sejda.core.manipulation.model.parameter.TaskParameters;
import org.sejda.core.manipulation.model.task.Task;

/**
 * Interface providing configuration for the tasks executions.
 * 
 * @author Andrea Vacondio
 * 
 */
interface TaskExecutionContext {

    /**
     * Search among the configured tasks the implementation that better can execute the input parameters. Returns an instance of the found class.
     * 
     * @param parameters
     *            Input parameters you want to search a task for.
     * @return the most suitable {@link Task} instance for the input parameters class.
     * @throws TaskException
     *             if no task able to execute the input parameters class is found, or if an error occur while reflective instantiating the {@link Task}.
     */
    Task<? extends TaskParameters> getTask(TaskParameters parameters) throws TaskException;

}
