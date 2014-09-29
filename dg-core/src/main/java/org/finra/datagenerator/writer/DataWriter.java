/*
 * Copyright 2014 DataGenerator Contributors
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
package org.finra.datagenerator.writer;

import org.finra.datagenerator.consumer.DataPipe;

/**
 * Outputs the search results contained in a DataPipe.
 *
 * Created by robbinbr on 5/28/2014.
 */
public interface DataWriter {

    /**
     * Writes an output to a given data pipe
     *
     * @param cr the DataPipe to write to
     */
    void writeOutput(DataPipe cr);
}
