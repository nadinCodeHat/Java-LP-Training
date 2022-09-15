
import schema from './schema';
import { handlerPath } from '@libs/handler-resolver';

const create = {
    handler: `${handlerPath(__dirname)}/create.main`,
    events: [
        {
            http: {
                method: 'post',
                path: 'students',
                request: {
                    schemas: {
                        'application/json': schema,
                    },
                },
                private: true,
            },
        },
    ],
};

const fetch = {
    handler: `${handlerPath(__dirname)}/fetch.main`,
    events: [
        {
            http: {
                method: 'get',
                path: 'students/{studId}'
            },
        },
    ],
};

const fetchAll = {
    handler: `${handlerPath(__dirname)}/fetchAll.main`,
    events: [
        {
            http: {
                method: 'get',
                path: 'students'
            },
        },
    ],
};

export { create, fetch, fetchAll }