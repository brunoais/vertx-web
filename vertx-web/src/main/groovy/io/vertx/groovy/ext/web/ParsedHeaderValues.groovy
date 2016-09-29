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

package io.vertx.groovy.ext.web;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
import java.util.List
import java.util.Set
/**
 * A container with the request's headers that are meaningful enough to be parsed
 * Contains:
 * <ul>
 * <li>Accept -> MIME header, parameters and sortable</li>
 * <li>Accept-Charset -> Parameters and sortable</li>
 * <li>Accept-Encoding -> Parameters and sortable</li>
 * <li>Accept-Language -> Parameters and sortable</li>
 * <li>Content-Type -> MIME header and parameters</li>
 * </ul>
 *
*/
@CompileStatic
public class ParsedHeaderValues {
  private final def io.vertx.ext.web.ParsedHeaderValues delegate;
  public ParsedHeaderValues(Object delegate) {
    this.delegate = (io.vertx.ext.web.ParsedHeaderValues) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public List<MIMEHeader> accept() {
    def ret = (List)delegate.accept()?.collect({InternalHelper.safeCreate(it, io.vertx.groovy.ext.web.MIMEHeader.class)});
    return ret;
  }
  public List<ParsedHeaderValue> acceptCharset() {
    def ret = (List)delegate.acceptCharset()?.collect({InternalHelper.safeCreate(it, io.vertx.groovy.ext.web.ParsedHeaderValue.class)});
    return ret;
  }
  public List<ParsedHeaderValue> acceptEncoding() {
    def ret = (List)delegate.acceptEncoding()?.collect({InternalHelper.safeCreate(it, io.vertx.groovy.ext.web.ParsedHeaderValue.class)});
    return ret;
  }
  public List<LanguageHeader> acceptLanguage() {
    def ret = (List)delegate.acceptLanguage()?.collect({InternalHelper.safeCreate(it, io.vertx.groovy.ext.web.LanguageHeader.class)});
    return ret;
  }
  public MIMEHeader contentType() {
    def ret = InternalHelper.safeCreate(delegate.contentType(), io.vertx.groovy.ext.web.MIMEHeader.class);
    return ret;
  }
  /**
   * Given the sorted list of parsed header values the user has sent and an Iterable of acceptable values:
   * It finds the first accepted header that matches any inside the Iterable.
   * @param accepted The sorted list of headers to find the best one.
   * @param inSet 
   * @return The first header that matched, otherwise empty if none matched
   */
  public ParsedHeaderValue findBestUserAcceptedIn(List<ParsedHeaderValue> accepted, Set<ParsedHeaderValue> inSet) {
    def ret = InternalHelper.safeCreate(delegate.findBestUserAcceptedIn(accepted != null ? (List)accepted.collect({(io.vertx.ext.web.ParsedHeaderValue)it.getDelegate()}) : null, inSet != null ? (Set)inSet.collect({(io.vertx.ext.web.ParsedHeaderValue)it.getDelegate()}) as Set : null), io.vertx.groovy.ext.web.ParsedHeaderValue.class);
    return ret;
  }
}
