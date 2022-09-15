import type { ValidatedEventAPIGatewayProxyEvent } from '@libs/api-gateway';
import { middyfy } from '@libs/lambda';
import { successResponse } from '@libs/response';
import { Student } from 'src/entities/student.entity';

import schema from './schema';
import { create } from './student-service';

const createStudent: ValidatedEventAPIGatewayProxyEvent<typeof schema> = async (event) => {
    const student: Student = event.body as any as Student;
    const std = await create(student);
    return successResponse({
        student
    });
};
export const main = middyfy(createStudent);
