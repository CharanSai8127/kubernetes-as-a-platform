# Authentication Vs Authorization

Kubernetes access control consists of:
- authentication
- authorization

Both are required for secure platform operation.

---

# Authentication

Authentication answers:

Who are you?

Examples include:
- IAM identities
- OIDC identities
- service accounts
- certificates

Authentication verifies:
- identity.

---

# Authorization

Authorization answers:

What are you allowed to do?

Authorization determines:
- allowed actions
- allowed resources
- and allowed scope.

---

# Runtime Access Flow

Access commonly follows:

Authentication
↓

Authorization
↓

Resource Access

---

# Platform Engineering Perspective

Identity without authorization creates:
- uncontrolled access.

---

# Key Insight

Authentication verifies identity while authorization controls permissions.
