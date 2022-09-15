import { getDatabaseConnection } from "@libs/database-manager";
import { Student } from "src/entities/student.entity";

const create = async (student: Student): Promise<Student> => {
    const studentRepository = await (await getDatabaseConnection()).getRepository(Student);
    const newStudent: Student = await studentRepository.save(student).catch(e => {
        console.error('failed to create student record', e)
        return null;
    });
    return newStudent;
}

const fetch = async (studentId: string): Promise<Student> => {
    const studentRepository = await (await getDatabaseConnection()).getRepository(Student);
    const newStudent: Student = await studentRepository.findOneBy({ id: studentId }).catch(e => {
        console.error('failed to fetch student record', e)
        return null;
    });
    return newStudent;
}

const fetchAll = async (): Promise<Student[]> => {
    const studentRepository = await (await getDatabaseConnection()).getRepository(Student);
    const students: Student[] = await studentRepository.find().catch(e => {
        console.error('failed to fetch students', e)
        return null;
    });
    return students;
}

export { create, fetch, fetchAll };