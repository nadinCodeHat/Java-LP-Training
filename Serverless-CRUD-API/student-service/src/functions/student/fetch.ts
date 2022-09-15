import { successResponse } from "@libs/response";
import { Student } from "src/entities/student.entity";
import { fetch } from "./student-service";


const fetchEmployee = async (event) => {
    const student: Student = await fetch(event.pathParameters.studId);
    return successResponse({ student })
}

export const main = fetchEmployee;