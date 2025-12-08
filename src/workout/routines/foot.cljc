(ns workout.routines.foot)

(def routine

  [{:exercise/name "Short Foot / Arch Lift"
    :exercise/information "Stand or sit with feet hip-width apart. 
                           Without curling your toes, gently draw the ball of your big toe toward your heel — your arch subtly lifts."}

   {:exercise/name "Toe Yoga: Big Toe Up / Little Toes Up"
    :exercise/information "Keep your heel and entire foot tripod on the ground. 
                           Lift big toe while keeping other toes down. 
                           Then lift the other four toes while keeping big toe down."}
   
   "Single Leg balance"

   "Calf raise (toe pointed ahead, in, or out)"

   "Tibialis Raise"

   {:exercise/name "Single-Leg Romanian Deadlift (Hip Hinge)"
    :exercise/self-paced? true}

   {:exercise/name "Resisted ankle inversion. Turn foot inwards"
    :exercise/two-sided? true
    :exercise/media-file "resisted-ankle-inversion.png"}

   {:exercise/name "Resisted ankle eversion. Turn foot outwards"
    :exercise/two-sided? true
    :exercise/media-file "resisted-ankle-eversion.png"}

   {:exercise/name "Resisted ankle plantar flexion. Point toes down"
    :exercise/two-sided? true
    :exercise/media-file "resisted-ankle-plantar-flexion.png"}

   {:exercise/name "Ankle opposition (isometric). Point toes up"
    :exercise/two-sided? true
    :exercise/media-file "ankle-opposition.png"}])
