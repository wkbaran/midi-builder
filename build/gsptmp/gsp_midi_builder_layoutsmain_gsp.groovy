import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.compiler.transform.LineNumber
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_midi_builder_layoutsmain_gsp extends org.grails.gsp.GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(2)
invokeTag('layoutTitle','g',7,['default':("Grails")],-1)
printHtmlPart(1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(1)
invokeTag('link','asset',10,['rel':("icon"),'href':("favicon.ico"),'type':("image/x-ico")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',12,['src':("application.css")],-1)
printHtmlPart(3)
invokeTag('layoutHead','g',14,[:],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('image','asset',20,['src':("grails.svg"),'alt':("Grails Logo")],-1)
printHtmlPart(7)
invokeTag('pageProperty','g',27,['name':("page.nav")],-1)
printHtmlPart(8)
invokeTag('layoutBody','g',33,[:],-1)
printHtmlPart(9)
invokeTag('image','asset',38,['src':("advancedgrails.svg"),'alt':("Grails Guides"),'class':("float-left")],-1)
printHtmlPart(10)
invokeTag('image','asset',46,['src':("documentation.svg"),'alt':("Grails Documentation"),'class':("float-left")],-1)
printHtmlPart(11)
invokeTag('image','asset',55,['src':("slack.svg"),'alt':("Grails Slack"),'class':("float-left")],-1)
printHtmlPart(12)
invokeTag('message','g',64,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(13)
invokeTag('javascript','asset',67,['src':("application.js")],-1)
printHtmlPart(5)
})
invokeTag('captureBody','sitemesh',69,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1565630809797L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
