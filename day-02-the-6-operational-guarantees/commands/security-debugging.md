# Security Debugging

## Check Pod Security Context

    kubectl get pod <pod-name> -o yaml

Useful for validating:
- runAsNonRoot
- privilege escalation
- filesystem permissions
- Linux capabilities

---

## Check ServiceAccount Usage

    kubectl get pod <pod-name> -o jsonpath='{.spec.serviceAccountName}'

Used to verify:
- workload identity
- RBAC association
- operational permissions

---

## Inspect RBAC Permissions

    kubectl auth can-i --list --as=system:serviceaccount:<namespace>:<serviceaccount>

Helps validate:
- workload privileges
- namespace access
- authorization scope

---

## Check Secrets in a Namespace

    kubectl get secrets -n <namespace>

Useful for:
- secret scoping
- namespace isolation
- credential exposure analysis

---

## Inspect NetworkPolicies

    kubectl get networkpolicy -A

Used to validate:
- traffic isolation
- east-west communication boundaries
- namespace segmentation

---

## Describe Security Events

    kubectl describe pod <pod-name>

Helps identify:
- permission failures
- denied operations
- runtime restriction issues

---

# Key Insight

Security debugging focuses on validating workload boundaries, privilege scope, and operational blast-radius containment.
