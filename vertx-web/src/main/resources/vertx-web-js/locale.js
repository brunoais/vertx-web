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

/** @module vertx-web-js/locale */
var utils = require('vertx-js/util/utils');
var ParsedHeaderValue = require('vertx-web-js/parsed_header_value');
var LanguageHeader = require('vertx-web-js/language_header');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JLocale = io.vertx.ext.web.Locale;

/**

 @class
*/
var Locale = function(j_val) {

  var j_locale = j_val;
  var that = this;
  LanguageHeader.call(this, j_val);

  /**
   Contains the raw value that was received from the user agent 

   @public

   @return {string}
   */
  this.rawValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["rawValue()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Holds the unparsed value of the header.<br>
   For the most part, this is the content before the semi-colon (";")

   @public

   @return {string}
   */
  this.value = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["value()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Holds the weight specified in the "q" parameter of the header.<br>
   If the parameter is not specified, 1.0 is assumed according to 
   <a href="https://tools.ietf.org/html/rfc7231#section-5.3.1">rfc7231</a>

   @public

   @return {number} 
   */
  this.weight = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["weight()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The value of the parameter specified by this key. Each is one of 3 things:
   <ol>
   <li>null &lt;- That key was not specified</li>
   <li>ParsedHeaderValue.EMPTY (tested using ==) &lt;- The value was not specified</li>
   <li>[Other] <- The value of the parameter</li>
   </ol>
   <b>Note:</b> The <code>q</code> parameter is never present.

   @public
   @param key {string} 
   @return {string} 
   */
  this.getParameter = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_locale["getParameter(java.lang.String)"](key);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The parameters specified in this header value.
   <b>Note:</b> The <code>q</code> parameter is never present.

   @public

   @return {Array.<string>} Unmodifiable Map of parameters of this header value
   */
  this.getParameters = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnMap(j_locale["getParameters()"]());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Is this an allowed operation as specified by the corresponding header?

   @public

   @return {boolean} 
   */
  this.isPermitted = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["isPermitted()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Test if this header is matched by matchTry header 

   @public
   @param matchTry {ParsedHeaderValue} The header to be matched from 
   @return {boolean} true if this header represents a subset of matchTry, otherwise, false
   */
  this.isMatchedBy = function(matchTry) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return j_locale["isMatchedBy(io.vertx.ext.web.ParsedHeaderValue)"](matchTry._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Finds the first ParsedHeaderValue in the list that matches with this header value.
   Will return an empty Optional if none match. 

   @public
   @param matchTries {Array.<ParsedHeaderValue>} A list of parsed headers to match from this header value 
   @return {ParsedHeaderValue} Optional potentially with the first matched header
   */
  this.findMatchedBy = function(matchTries) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      return utils.convReturnVertxGen(j_locale["findMatchedBy(java.util.Set)"](utils.convParamSetVertxGen(matchTries)), ParsedHeaderValue);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   An integer that represents the absolute order position of this header

   @public

   @return {number}
   */
  this.weightedOrder = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["weightedOrder()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The tag of the language as specified by 
   <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>.<br>
   Equivalent to 

   @public

   @return {string} 
   */
  this.tag = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["tag()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   A subtag of this language header.<br>
   + info: <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>

   @public
   @param level {number} 
   @return {string} 
   */
  this.subtag = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["subtag()"]();
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      return j_locale["subtag(int)"](__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The number of subtags this value has.

   @public

   @return {number}
   */
  this.subtagCount = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["subtagCount()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the language as reported by the HTTP client.

   @public

   @return {string} language
   */
  this.language = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["language()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the country as reported by the HTTP client.

   @public

   @return {string} variant
   */
  this.country = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["country()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the variant as reported by the HTTP client.

   @public

   @return {string} variant
   */
  this.variant = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_locale["variant()"]();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_locale;
};

/**

 @memberof module:vertx-web-js/locale
 @param language {string} 
 @param country {string} 
 @param variant {string} 
 @return {Locale}
 */
Locale.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(JLocale["create()"](), Locale);
  }else if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(JLocale["create(java.lang.String)"](__args[0]), Locale);
  }else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(JLocale["create(java.lang.String,java.lang.String)"](__args[0], __args[1]), Locale);
  }else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
    return utils.convReturnVertxGen(JLocale["create(java.lang.String,java.lang.String,java.lang.String)"](__args[0], __args[1], __args[2]), Locale);
  } else throw new TypeError('function invoked with invalid arguments');
};

// We export the Constructor function
module.exports = Locale;