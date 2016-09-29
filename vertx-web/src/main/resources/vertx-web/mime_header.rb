require 'vertx-web/parsed_header_value'
require 'vertx/util/utils.rb'
# Generated from io.vertx.ext.web.MIMEHeader
module VertxWeb
  class MIMEHeader < ::VertxWeb::ParsedHeaderValue
    # @private
    # @param j_del [::VertxWeb::MIMEHeader] the java delegate
    def initialize(j_del)
      super(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxWeb::MIMEHeader] the underlying java delegate
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
    #  Gets the parsed component part of the MIME. This is the string between the beginning and the first '/' of the MIME
    # @return [String] The component of the MIME this represents
    def component
      if !block_given?
        return @j_del.java_method(:component, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling component()"
    end
    #  Gets the parsed subcomponent part of the MIME. This is the string between the first '/' and the ';'
    #  or the end of the MIME
    # @return [String] The subcomponent of the MIME this represents
    def sub_component
      if !block_given?
        return @j_del.java_method(:subComponent, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling sub_component()"
    end
  end
end
