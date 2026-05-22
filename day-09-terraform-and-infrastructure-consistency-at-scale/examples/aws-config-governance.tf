resource "aws_config_configuration_recorder" "main" {
  name     = "platform-config-recorder"
  role_arn = aws_iam_role.config_role.arn
}

resource "aws_config_delivery_channel" "main" {
  name           = "platform-config-channel"
  s3_bucket_name = aws_s3_bucket.config_bucket.id
}
