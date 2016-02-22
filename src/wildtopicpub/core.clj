(ns wildtopicpub.core
  (:require [immutant.messaging :as msg]
            [immutant.util :as util])
  (:gen-class))

; TODO !!!
;
; help at:
; http://immutant.org/builds/LATEST/html-docs/messaging.html#sec-2-2
; http://immutant.org/documentation/2.1.2/apidoc/immutant.messaging.html
; https://github.com/immutant/feature-demo/tree/master/src/demo
;

(defonce tpc "topic1")

(defonce number-of-messages 10)

(defonce port (util/messaging-remoting-port))

(defn- create-message [id] 
  (str "Message with id = " id))

(defn- report [m]
  (println "Sending: " m))

(defn -main
  "It will publish 10 messages to the defined Topic"
  [& args]

  (println)
  (println "Publishing messages to Topic: " tpc)
  (println)

  (with-open [ctx (msg/context :host "localhost" :port port)]
    (dotimes [k number-of-messages]
      (report (create-message k))
      (msg/publish (msg/topic tpc :context ctx) (create-message k)) ))

  (println)
  (println "Publisher concluded")
  (println)
)


