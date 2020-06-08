import hudson.model.*
   node('master')
def call(body) {
sh '''
   echo "testing"
   '''
return this
   }
 
