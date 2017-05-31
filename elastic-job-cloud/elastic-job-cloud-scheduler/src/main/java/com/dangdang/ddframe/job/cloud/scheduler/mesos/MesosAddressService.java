/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.cloud.scheduler.mesos;

/**
 * Mesos地址服务.
 * 
 * @author liguangyun
 */
public class MesosAddressService {
    
    private static String masterUrl;
    
    /**
     * 注册Mesos的Master信息.
     * 
     * @param hostName Master的主机名
     * @param port Master端口
     */
    public static synchronized void register(final String hostName, final int port) {
        masterUrl = String.format("http://%s:%d", hostName, port);
    }
    
    /**
     * 注销Mesos的Master信息.
     */
    public static synchronized void deregister() {
        masterUrl = null;
    }
    
    /**
     * 获取Mesos Master地址.
     * 
     * @return Mesos Master地址
     */
    public String getMasterUrl() {
        return masterUrl;
    }
}
