;
; Copyright © 2014-2017 Peter Monks (pmonks@gmail.com)
;
; All rights reserved. This program and the accompanying materials
; are made available under the terms of the Eclipse Public License v1.0
; which accompanies this distribution, and is available at
; http://www.eclipse.org/legal/epl-v10.html
;
; Contributors:
;    Peter Monks - initial implementation

(defproject org.clojars.pmonks/spinner "0.5.0-SNAPSHOT"
  :description         "Simple text spinner for command line Clojure apps."
  :url                 "https://github.com/pmonks/spinner"
  :license             {:name "Eclipse Public License"
                        :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version    "2.8.1"
  :repositories        [
                         ["sonatype-snapshots" {:url "https://oss.sonatype.org/content/groups/public" :snapshots true}]
                         ["jitpack"            {:url "https://jitpack.io"                             :snapshots true}]
                       ]
  :plugins             [
                         [lein-codox "0.10.3"]
                       ]
  :dependencies        [
                         [org.clojure/clojure "1.9.0"]
                         [jansi-clj           "0.1.1"]
                       ]
  :profiles            {:dev {:dependencies [
                                              [midje "1.9.1"]
                                            ]
                              :plugins      [[lein-midje "3.2.1"]]}   ; Don't remove this or travis-ci will assplode!
                        :uberjar {:aot :all}}
  :deploy-repositories [
                         ["snapshots" {:url      "https://clojars.org/repo"
                                       :username :env/clojars_username
                                       :password :env/clojars_password}]
                         ["releases"  {:url      "https://clojars.org/repo"
                                       :username :env/clojars_username
                                       :password :env/clojars_password}]
                       ]
  :codox               {
                         :source-uri "https://github.com/pmonks/spinner/blob/master/{filepath}#L{line}"
                       }
  )
