terraform {
  backend "s3" {
    bucket = "terraform-state-platform"
    key    = "eks/terraform.tfstate"
    region = "us-east-1"
  }
}
