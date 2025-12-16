package com.dylan.view.utilmapper;

import com.dylan.view.dto.eye_exam.request.EyeExamCreateRequest;
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

    public static EyeExam toEntity(EyeExamCreateRequest eyeExamCreateRequest) {
        if (eyeExamCreateRequest == null)
            return null;

        EyeExam eyeExam = new EyeExam();
        eyeExam.setRightEyeSphere(eyeExamCreateRequest.getRightEyeSphere());
        eyeExam.setRightEyeCylinder(eyeExamCreateRequest.getRightEyeCylinder());
        eyeExam.setRightEyeAxis(eyeExamCreateRequest.getRightEyeAxis());
        eyeExam.setLeftEyeSphere(eyeExamCreateRequest.getLeftEyeSphere());
        eyeExam.setLeftEyeCylinder(eyeExamCreateRequest.getLeftEyeCylinder());
        eyeExam.setLeftEyeAxis(eyeExamCreateRequest.getLeftEyeAxis());
        eyeExam.setPd(eyeExamCreateRequest.getPd());
        eyeExam.setExamNotes(eyeExamCreateRequest.getExamNotes());
        eyeExam.setExamDate(eyeExamCreateRequest.getExamDate());

        return eyeExam;
    }

}
