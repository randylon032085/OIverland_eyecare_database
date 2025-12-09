package com.dylan.view.utilmapper;

import com.dylan.view.dto.eye_exam.response.EyeExamResponse;
import com.dylan.view.model.EyeExam;

public class EyeExamMapper {

    public static EyeExamResponse toDto(EyeExam eyeExam) {
        if (eyeExam == null)
            return null;

        return new EyeExamResponse(
                AppointmentMapper.toDto(eyeExam.getAppointment()),
                eyeExam.getRightEyeSphere(),
                eyeExam.getRightEyeCylinder(),
                eyeExam.getRightEyeAxis(),
                eyeExam.getLeftEyeSphere(),
                eyeExam.getLeftEyeCylinder(),
                eyeExam.getLeftEyeAxis(),
                eyeExam.getPd(),
                eyeExam.getExamNotes(),
                eyeExam.getExamDate());

    }

}
