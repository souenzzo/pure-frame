(ns todomvc.dev
  (:require [todomvc.core :as todomvc]
            [figwheel.client :as fw]
            [devtools.core :as devtools]))

(devtools/install!)

(fw/start {:on-jsload     todomvc/main
           :websocket-url "ws://localhost:3450/figwheel-ws"})
