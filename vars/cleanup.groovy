#!/usr/bin/env groovy
//variables for npm_registry,nexus_url_imagine is added in global variables.
def call(body) {
    node{
    script{
    sh '''
    echo "Running npm clean"
       '''
 return this
}
}
}
