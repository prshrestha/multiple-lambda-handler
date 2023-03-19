### **Triggering two handler method on one project.**

![console work](https://github.com/prshrestha/multiple-lambda-handler/blob/main/lambda.gif)


- Run `mvn clean package shade:shade` to package the jar.

- Upload the jar on an S3 bucket.

- Create two lambda functions on console with basic IAM role.

- Link the jar stored on S3 bucket to the lambda source code.

- Write the handler method.

- Test the function by passing a String from the test console.
