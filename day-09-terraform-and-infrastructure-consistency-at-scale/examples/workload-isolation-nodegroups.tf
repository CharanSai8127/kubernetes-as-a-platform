resource "aws_eks_node_group" "monitoring" {
  cluster_name    = aws_eks_cluster.main.name
  node_group_name = "monitoring-workers"

  labels = {
    workload = "monitoring"
  }

  taint {
    key    = "monitoring"
    value  = "true"
    effect = "NO_SCHEDULE"
  }
}
