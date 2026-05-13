# Argo Rollouts

Argo Rollouts extends Kubernetes deployment strategies with progressive delivery capabilities.

Traditional rolling deployments provide gradual replacement of workloads.

Argo Rollouts introduces:
- canary deployments
- blue/green deployments
- traffic shifting
- rollout pausing
- metric analysis

This allows deployments to progress incrementally while validating platform stability.

Benefits:
- reduced blast radius
- safer deployments
- controlled rollback
- observable rollout behavior

Progressive delivery improves safety by slowing the rate of production change.
