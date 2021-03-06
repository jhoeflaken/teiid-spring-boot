/*
 * Copyright 2012-2017 the original author or authors.
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
package org.teiid.spring.data.mysql;

import org.teiid.spring.data.ConnectionFactoryConfiguration;

@ConnectionFactoryConfiguration(
        alias = "mysql",
        translatorName = "mysql",
        driverNames={"com.mysql.jdbc.Driver"},
        datasourceNames={"com.mysql.jdbc.jdbc2.optional.MysqlXADataSource"},
        url="jdbc:mysql://{host}:3306/{db-name}",
        dialect="org.hibernate.dialect.MySQL5InnoDBDialect",
        jdbc=true
        )
public class MysqlDataSourceConfiguration {

}
