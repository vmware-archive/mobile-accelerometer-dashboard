import grails.util.Environment

boolean dev = Environment.isDevelopmentMode()

modules = {

    'd3' {
        resource id: 'd3', url: [plugin: 'd3', dir: 'js/D3', file: "d3${dev ? '' : '.min'}.js"], disposition: 'head',
                exclude: 'minify'
    }
}