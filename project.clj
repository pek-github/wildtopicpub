(defproject wildtopicpub "0.1.0-SNAPSHOT"
  :description "A tiny test app with WildFly and HornetQ, as a Topic Publisher"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.immutant/immutant "2.1.2"]
                ]
  :main ^:skip-aot wildtopicpub.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all} }
)

