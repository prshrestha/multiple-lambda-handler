### **Triggering two handler method on one project.**

Gif of the console work

![console work](https://github.com/prshrestha/multiple-lambda-handler/blob/master/lambda.gif)


run mvn clean package shade:shade to package the jar.

Upload the jar on an S3 bucket.

Create two lambda functions on console with basic IAM role.

Link the jar stored on S3 bucket to the lambda source code.

Write the handler method.

Test the function by passing a String from the test console.
