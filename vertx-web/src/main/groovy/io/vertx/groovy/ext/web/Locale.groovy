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
import java.util.Map
import java.util.Set
/**
*/
@CompileStatic
public class Locale extends LanguageHeader {
  private final def io.vertx.ext.web.Locale delegate;
  public Locale(Object delegate) {
    super((io.vertx.ext.web.Locale) delegate);
    this.delegate = (io.vertx.ext.web.Locale) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public static Locale create() {
    def ret = InternalHelper.safeCreate(io.vertx.ext.web.Locale.create(), io.vertx.groovy.ext.web.Locale.class);
    return ret;
  }
  public static Locale create(String language) {
    def ret = InternalHelper.safeCreate(io.vertx.ext.web.Locale.create(language), io.vertx.groovy.ext.web.Locale.class);
    return ret;
  }
  public static Locale create(String language, String country) {
    def ret = InternalHelper.safeCreate(io.vertx.ext.web.Locale.create(language, country), io.vertx.groovy.ext.web.Locale.class);
    return ret;
  }
  public static Locale create(String language, String country, String variant) {
    def ret = InternalHelper.safeCreate(io.vertx.ext.web.Locale.create(language, country, variant), io.vertx.groovy.ext.web.Locale.class);
    return ret;
  }
  /**
   * Returns the language as reported by the HTTP client.
   * @return language
   */
  public String language() {
    def ret = delegate.language();
    return ret;
  }
  /**
   * Returns the country as reported by the HTTP client.
   * @return variant
   */
  public String country() {
    def ret = delegate.country();
    return ret;
  }
  /**
   * Returns the variant as reported by the HTTP client.
   * @return variant
   */
  public String variant() {
    def ret = delegate.variant();
    return ret;
  }
}
