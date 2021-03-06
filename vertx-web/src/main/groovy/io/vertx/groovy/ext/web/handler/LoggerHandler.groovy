/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.groovy.ext.web.handler;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
import io.vertx.groovy.ext.web.RoutingContext
import io.vertx.core.Handler
import io.vertx.ext.web.handler.LoggerFormat
/**
 * A handler which logs request information to the Vert.x logger.
*/
@CompileStatic
public class LoggerHandler implements Handler<RoutingContext> {
  private final def io.vertx.ext.web.handler.LoggerHandler delegate;
  public LoggerHandler(Object delegate) {
    this.delegate = (io.vertx.ext.web.handler.LoggerHandler) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public void handle(RoutingContext arg0) {
    ((io.vertx.core.Handler) delegate).handle(arg0 != null ? (io.vertx.ext.web.RoutingContext)arg0.getDelegate() : null);
  }
  /**
   * Create a handler with default format
   * @return the handler
   */
  public static LoggerHandler create() {
    def ret = InternalHelper.safeCreate(io.vertx.ext.web.handler.LoggerHandler.create(), io.vertx.groovy.ext.web.handler.LoggerHandler.class);
    return ret;
  }
  /**
   * Create a handler with he specified format
   * @param format the format
   * @return the handler
   */
  public static LoggerHandler create(LoggerFormat format) {
    def ret = InternalHelper.safeCreate(io.vertx.ext.web.handler.LoggerHandler.create(format), io.vertx.groovy.ext.web.handler.LoggerHandler.class);
    return ret;
  }
  /**
   * Create a handler with he specified format
   * @param immediate true if logging should occur as soon as request arrives
   * @param format the format
   * @return the handler
   */
  public static LoggerHandler create(boolean immediate, LoggerFormat format) {
    def ret = InternalHelper.safeCreate(io.vertx.ext.web.handler.LoggerHandler.create(immediate, format), io.vertx.groovy.ext.web.handler.LoggerHandler.class);
    return ret;
  }
}
