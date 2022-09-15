export default {
    StudentCreate: {
        Type: 'AWS::SNS::Topic',
        Properties: {
            TopicName: 'aws-student-create-topic-${sls:stage}',
        },
    },
}