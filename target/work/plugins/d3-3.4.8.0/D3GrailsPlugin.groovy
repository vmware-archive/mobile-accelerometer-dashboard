class D3GrailsPlugin {
    def version = "3.4.8.0"
    def grailsVersion = "2.0 > *"
    def pluginExcludes = [
            "grails-app/views/*"
    ]

    def title = "D3 resources"
    def author = "Jean-Louis Jouannic"
    def authorEmail = "jeanlouis.jouannic+d3grailsplugin@gmail.com"
    def description = '''Provides resource files for the D3.js JavaScript library.'''
    def documentation = "http://grails.org/plugin/d3"

    def license = "APACHE"
    def issueManagement = [system: "github", url: "https://github.com/jljouannic/d3-grails-plugin/issues"]
    def scm = [url: "https://github.com/jljouannic/d3-grails-plugin"]
}
