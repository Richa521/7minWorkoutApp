package com.comp.a7minutesworkout

object Constants {
    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false

        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(
            2,
            "Wall Sit",
            R.drawable.ic_wall_sit,
            false,
            false

        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(
            3,
            "Push Up",
            R.drawable.ic_push_up,
            false,
            false
        )
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(
            4,
            "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch,
            false,
            false

        )
        exerciseList.add(abdominalCrunch)

        val highKneesRunning = ExerciseModel(
            5,
            "High knees running in place",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false

        )
        exerciseList.add(highKneesRunning)

        val lunge = ExerciseModel(
            6,
            "Lunges",
            R.drawable.ic_lunge,
            false,
            false

        )
        exerciseList.add(lunge)

        val plank = ExerciseModel(
            7,
            "Plank",
            R.drawable.ic_plank,
            false,
            false

        )
        exerciseList.add(plank)

        val stepUpChair = ExerciseModel(
            8,
            "Step up onto chair",
            R.drawable.ic_step_up_onto_chair,
            false,
            false

        )
        exerciseList.add(stepUpChair)

        val tricepsOnChair = ExerciseModel(
            9,
            "Triceps dip on chair",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false

        )
        exerciseList.add(tricepsOnChair)

        val sidePlank = ExerciseModel(
            10,
            "Side Plank",
            R.drawable.ic_side_plank,
            false,
            false

        )
        exerciseList.add(sidePlank)

        val pushUpRotate = ExerciseModel(
            11,
            "Push Up and rotation",
            R.drawable.ic_push_up_and_rotation,
            false,
            false

        )
        exerciseList.add(pushUpRotate)

        val squat = ExerciseModel(
            12,
            "Squats",
            R.drawable.ic_squat,
            false,
            false

        )
        exerciseList.add(squat)



        return exerciseList
    }

}