(ns workout.exercises.custom)

(def exercises
  #{
    {:exercise/name "Glute bridge"
     :exercise/media-file "glute-bridge.webm"}
    
    {:exercise/name "Monster walk"
      :exercise/media-file "monster-walk.webm"}
    
    {:exercise/name "Squat"
     :exercise/instructions "While resting: Door twist, Door arm raise, paloff press"
     :exercise/self-paced? true}
    
    {:exercise/name "face pull"}

    {:exercise/name "Band pull aparts"
     :exercise/media-file "posture-band-pull.webm"
     :exercise/instructions "Thumbs out"}
    
    {:exercise/name "Bench or Overhead press"
     :exercise/instructions "While resting: calf stretch, quad stretch"
     :exercise/self-paced? true}
    
    {:exercise/name "Deadlift"
     :exercise/self-paced? true}
        
    {:exercise/name "Paloff press"
     :exercise/media-file "paloff.png"}
    
    {:exercise/name "Door Twist"
     :exercise/two-sided? true
     :exercise/instructions "Elbow against door frame; twist chest open; hand back"
     :exercise/media-file "posture-door-chest-twist.webm"}
    
    {:exercise/name "Triceps and lat stretch"
     :exercise/two-sided? true
     :exercise/media-file "triceps-and-lat-stretch.png"}
    
    {:exercise/name "Forearm flexor stretch"
     :exercise/two-sided? true
     :exercise/media-file "forearm-flexor-stretch.png"}
    
    {:exercise/name "Forearm extensor stretch"
     :exercise/two-sided? true
     :exercise/media-file "forearm-extensor-stretch.png"}
    
    {:exercise/name "Shoulder rolls"
     :exercise/instructions "Scapular circles"
     :exercise/two-sided? true}
    
    {:exercise/name "Triceps eccentric control"
     :exercise/two-sided? true
     :exercise/media-file "triceps-eccentric-control.webm"}
    
    {:exercise/name "Pronation-supination drill"
     :exercise/two-sided? true
     :exercise/media-file "pronation-supination-drill.webm"}
    
    {:exercise/name "External rotation"
     :exercise/two-sided? true
     :exercise/instructions "Band or cable"
     :exercise/media-file "external-rotation.webm"}
    
    {:exercise/name "Quadruped rocking"
     :exercise/two-sided? true
     :exercise/media-file "quadruped-rocking.webm"
     :exercise/instructions "Elbows slightly bent"}
  })
