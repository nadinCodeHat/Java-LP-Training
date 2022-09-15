import { successResponse } from "@libs/response";
import { Student } from "src/entities/student.entity";
import { fetchAll } from "./student-service";


const fetchAllEmployee = async (event) => {
    const students: Student[] = await fetchAll();
    return successResponse({ students })
}

export const main = fetchAllEmployee;