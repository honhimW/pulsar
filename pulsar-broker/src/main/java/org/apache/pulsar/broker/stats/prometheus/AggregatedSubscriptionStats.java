/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pulsar.broker.stats.prometheus;

import java.util.HashMap;
import java.util.Map;
import org.apache.pulsar.broker.service.Consumer;

public class AggregatedSubscriptionStats {

    public long msgBacklog;

    public long msgBacklogNoDelayed;

    public boolean blockedSubscriptionOnUnackedMsgs;

    public double msgRateRedeliver;

    public long unackedMessages;

    public double msgRateOut;

    public double messageAckRate;

    public double msgThroughputOut;

    public long msgDelayed;

    long msgOutCounter;

    long bytesOutCounter;

    long lastExpireTimestamp;

    long lastConsumedFlowTimestamp;

    long lastConsumedTimestamp;

    long lastAckedTimestamp;

    long lastMarkDeleteAdvancedTimestamp;

    double msgRateExpired;

    long totalMsgExpired;

    double msgDropRate;

    long consumersCount;

    long filterProcessedMsgCount;

    long filterAcceptedMsgCount;

    long filterRejectedMsgCount;

    long filterRescheduledMsgCount;

    public Map<Consumer, AggregatedConsumerStats> consumerStat = new HashMap<>();

    long delayedMessageIndexSizeInBytes;
}
