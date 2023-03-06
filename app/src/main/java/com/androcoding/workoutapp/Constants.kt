package com.androcoding.workoutapp

object Constants {
    fun  defaultExerciseList():ArrayList<ExerciseModel>{
        val exerciseList=ArrayList<ExerciseModel>()
        val jumpingJacks=ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            isSelected = false
        )
         exerciseList.add(jumpingJacks)

        val lunge=ExerciseModel(
            2,
            "Lunge",
            R.drawable.ic_lunge,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(lunge)

        val plank=ExerciseModel(
            3,
            "Plank",
            R.drawable.ic_lunge,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(plank)

        val abdominalCrunch=ExerciseModel(
            4,
            "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(abdominalCrunch)

        val highKneesRunning=ExerciseModel(
            5,
            "High Knees Running in Place",
            R.drawable.ic_high_knees_running_in_place,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(highKneesRunning)

        val pushUp=ExerciseModel(
            6,
            "Push Up",
            R.drawable.ic_push_up,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(pushUp)

        val pushUpAndRotation=ExerciseModel(
            7,
            "PushUp And Rotation",
            R.drawable.ic_push_up_and_rotation,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(pushUpAndRotation)


        val sidePlank=ExerciseModel(
            8,
            "Side Plank",
            R.drawable.ic_side_plank,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(sidePlank)

        val squat=ExerciseModel(
            9,
            "Squat",
            R.drawable.ic_squat,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(squat)

        val stepUpOntoChair=ExerciseModel(
            10,
            "Step Up Onto Chair",
            R.drawable.ic_step_up_onto_chair,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(stepUpOntoChair)

        val tricepsDipOnChair=ExerciseModel(
            11,
            "Triceps Dip On Chair",
            R.drawable.ic_triceps_dip_on_chair,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(tricepsDipOnChair)

        val wallSit=ExerciseModel(
            12,
            "Wall Sit",
            R.drawable.ic_wall_sit,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(wallSit)

        return  exerciseList
    }
}