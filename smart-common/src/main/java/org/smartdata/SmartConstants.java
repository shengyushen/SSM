/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartdata;

public class SmartConstants {
  public static final String SMART_HDFS_STATES_UPDATE_SERVICE_IMPL =
    "org.smartdata.hdfs.HdfsStatesUpdateService";

  public static final String SMART_ALLUXIO_STATES_UPDATE_SERVICE_IMPL =
    "org.smartdata.alluxio.AlluxioStatesUpdateService";

  public static final String SMART_HDFS_ACTION_SCHEDULER_SERVICE_IMPL =
    "org.smartdata.hdfs.scheduler.MoverScheduler, "
        + "org.smartdata.hdfs.scheduler.CopyScheduler, "
        + "org.smartdata.hdfs.scheduler.Copy2S3Scheduler,"
        + "org.smartdata.hdfs.scheduler.SmallFileScheduler,"
        + "org.smartdata.hdfs.scheduler.CompressionScheduler,"
        + "org.smartdata.hdfs.scheduler.ErasureCodingScheduler,"
        + "org.smartdata.hdfs.scheduler.CacheScheduler";

  public static final String SMART_HDFS_LAST_INOTIFY_TXID =
    "smart_hadoop_last_inotify_txid";

  public static final String SMART_ALLUXIO_LAST_ENTRY_SN =
      "smart_alluxio_last_entry_sn";

  public static final String SMART_CLIENT_PROTOCOL_NAME =
    "org.smartdata.protocol.SmartClientProtocol";

  public static final String SMART_ADMIN_PROTOCOL_NAME =
    "org.smartdata.protocol.SmartAdminProtocol";

  public static final String SMART_CLIENT_DISABLED_ID_FILE =
    "/tmp/SMART_CLIENT_DISABLED_ID_FILE";

  public static final String NUMBER_OF_SMART_AGENT =
      "number_of_smart_agent_in_agents_file";

  public static final String SYSTEM_FOLDER = "/system/";

  public static final String SMART_SERVER_ID_FILE = SYSTEM_FOLDER + "ssm.id";

  public static final String MOVER_ID_PATH = SYSTEM_FOLDER + "mover.id";

  public static final String SMART_FILE_STATE_XATTR_NAME = "user.ssmFileState";

  public static final String AGENT_CMDLET_SERVICE_NAME = "AgentCmdletService";
}
