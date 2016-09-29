require 'vertx-web/parsed_header_value'
require 'vertx-web/language_header'
require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.web.Locale
module VertxWeb
  class Locale < ::VertxWeb::LanguageHeader
    # @private
    # @param j_del [::VertxWeb::Locale] the java delegate
    def initialize(j_del)
      super(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxWeb::Locale] the underlying java delegate
    def j_del
      @j_del
    end
    #  Contains the raw value that was received from the user agent 
    # @return [String]
    def raw_value
      if !block_given?
        return @j_del.java_method(:rawValue, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling raw_value()"
    end
    #  Holds the unparsed value of the header.<br>
    #  For the most part, this is the content before the semi-colon (";")
    # @return [String]
    def value
      if !block_given?
        return @j_del.java_method(:value, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling value()"
    end
    #  Holds the weight specified in the "q" parameter of the header.<br>
    #  If the parameter is not specified, 1.0 is assumed according to 
    #  <a href="https://tools.ietf.org/html/rfc7231#section-5.3.1">rfc7231</a>
    # @return [Float] 
    def weight
      if !block_given?
        return @j_del.java_method(:weight, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling weight()"
    end
    #  The value of the parameter specified by this key. Each is one of 3 things:
    #  <ol>
    #  <li>null &lt;- That key was not specified</li>
    #  <li>ParsedHeaderValue.EMPTY (tested using ==) &lt;- The value was not specified</li>
    #  <li>[Other] <- The value of the parameter</li>
    #  </ol>
    #  <b>Note:</b> The <code>q</code> parameter is never present.
    # @param [String] key 
    # @return [String] 
    def get_parameter(key=nil)
      if key.class == String && !block_given?
        return @j_del.java_method(:getParameter, [Java::java.lang.String.java_class]).call(key)
      end
      raise ArgumentError, "Invalid arguments when calling get_parameter(key)"
    end
    #  The parameters specified in this header value.
    #  <b>Note:</b> The <code>q</code> parameter is never present.
    # @return [Hash{String => String}] Unmodifiable Map of parameters of this header value
    def get_parameters
      if !block_given?
        return Java::IoVertxLangRuby::Helper.adaptingMap(@j_del.java_method(:getParameters, []).call(), Proc.new { |val| ::Vertx::Util::Utils.from_object(val) }, Proc.new { |val| ::Vertx::Util::Utils.to_string(val) })
      end
      raise ArgumentError, "Invalid arguments when calling get_parameters()"
    end
    #  Is this an allowed operation as specified by the corresponding header?
    # @return [true,false] 
    def permitted?
      if !block_given?
        return @j_del.java_method(:isPermitted, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling permitted?()"
    end
    #  Test if this header is matched by matchTry header 
    # @param [::VertxWeb::ParsedHeaderValue] matchTry The header to be matched from
    # @return [true,false] true if this header represents a subset of matchTry, otherwise, false
    def matched_by?(matchTry=nil)
      if matchTry.class.method_defined?(:j_del) && !block_given?
        return @j_del.java_method(:isMatchedBy, [Java::IoVertxExtWeb::ParsedHeaderValue.java_class]).call(matchTry.j_del)
      end
      raise ArgumentError, "Invalid arguments when calling matched_by?(matchTry)"
    end
    #  Finds the first ParsedHeaderValue in the list that matches with this header value.
    #  Will return an empty Optional if none match. 
    # @param [Set<::VertxWeb::ParsedHeaderValue>] matchTries A list of parsed headers to match from this header value
    # @return [::VertxWeb::ParsedHeaderValue] Optional potentially with the first matched header
    def find_matched_by(matchTries=nil)
      if matchTries.class == Set && !block_given?
        return ::Vertx::Util::Utils.safe_create(@j_del.java_method(:findMatchedBy, [Java::JavaUtil::Set.java_class]).call(Java::JavaUtil::LinkedHashSet.new(matchTries.map { |element| element.j_del })),::VertxWeb::ParsedHeaderValue)
      end
      raise ArgumentError, "Invalid arguments when calling find_matched_by(matchTries)"
    end
    #  An integer that represents the absolute order position of this header
    # @return [Fixnum]
    def weighted_order
      if !block_given?
        return @j_del.java_method(:weightedOrder, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling weighted_order()"
    end
    #  The tag of the language as specified by 
    #  <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>.<br>
    #  Equivalent to 
    # @return [String] 
    def tag
      if !block_given?
        return @j_del.java_method(:tag, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling tag()"
    end
    #  A subtag of this language header.<br>
    #  + info: <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>
    # @param [Fixnum] level 
    # @return [String] 
    def subtag(level=nil)
      if !block_given? && level == nil
        return @j_del.java_method(:subtag, []).call()
      elsif level.class == Fixnum && !block_given?
        return @j_del.java_method(:subtag, [Java::int.java_class]).call(level)
      end
      raise ArgumentError, "Invalid arguments when calling subtag(level)"
    end
    #  The number of subtags this value has.
    # @return [Fixnum]
    def subtag_count
      if !block_given?
        return @j_del.java_method(:subtagCount, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling subtag_count()"
    end
    # @param [String] language 
    # @param [String] country 
    # @param [String] variant 
    # @return [::VertxWeb::Locale]
    def self.create(language=nil,country=nil,variant=nil)
      if !block_given? && language == nil && country == nil && variant == nil
        return ::Vertx::Util::Utils.safe_create(Java::IoVertxExtWeb::Locale.java_method(:create, []).call(),::VertxWeb::Locale)
      elsif language.class == String && !block_given? && country == nil && variant == nil
        return ::Vertx::Util::Utils.safe_create(Java::IoVertxExtWeb::Locale.java_method(:create, [Java::java.lang.String.java_class]).call(language),::VertxWeb::Locale)
      elsif language.class == String && country.class == String && !block_given? && variant == nil
        return ::Vertx::Util::Utils.safe_create(Java::IoVertxExtWeb::Locale.java_method(:create, [Java::java.lang.String.java_class,Java::java.lang.String.java_class]).call(language,country),::VertxWeb::Locale)
      elsif language.class == String && country.class == String && variant.class == String && !block_given?
        return ::Vertx::Util::Utils.safe_create(Java::IoVertxExtWeb::Locale.java_method(:create, [Java::java.lang.String.java_class,Java::java.lang.String.java_class,Java::java.lang.String.java_class]).call(language,country,variant),::VertxWeb::Locale)
      end
      raise ArgumentError, "Invalid arguments when calling create(language,country,variant)"
    end
    #  Returns the language as reported by the HTTP client.
    # @return [String] language
    def language
      if !block_given?
        return @j_del.java_method(:language, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling language()"
    end
    #  Returns the country as reported by the HTTP client.
    # @return [String] variant
    def country
      if !block_given?
        return @j_del.java_method(:country, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling country()"
    end
    #  Returns the variant as reported by the HTTP client.
    # @return [String] variant
    def variant
      if !block_given?
        return @j_del.java_method(:variant, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling variant()"
    end
  end
end
